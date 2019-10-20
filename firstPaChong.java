package com.sy.index;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 爬虫示例
 * @author dingzhen
 *
 */
public class firstPaChong {
    //提取的数据存放到该目录下
    private static String savepath="C:/Users/孙宇/Desktop/test/";
    //等待爬取的url
    private static List<String> allwaiturl=new ArrayList<String>();
    //爬取过的url
    private static Set<String> alloverurl=new HashSet<String>();
    //记录所有url的深度进行爬取判断
    private static Map<String,Integer> allurldepth=new HashMap<String, Integer>();
    //爬取得深度
    private static int maxdepth=999999;
    //生命对象，帮助进行线程的等待操作
    private static Object obj=new Object();
    //记录总线程数5条
    private static int MAX_THREAD=1;


    //爬取完一次筛选整理一次
    //筛选标题和内容
    //建立存储数据的字符串,筛选之前
    private static String contentBefor="";
    //建立存储数据的字符串,筛选之后
    private static String contentAfter="";
    //最终内容
    private static String contentEnd="";
    public static void main(String args[]){
        //确定爬取的网页地址，此处为当当网首页上的图书分类进去的网页
        //网址为        http://book.dangdang.com/
//        String strurl="http://search.dangdang.com/?key=%BB%FA%D0%B5%B1%ED&act=input";
        String strurl="https://m.dingdianxs.com/5/5155/28202973.html";


        //workurl(strurl,1);
        addurl(strurl,0);
        for(int i=0;i<MAX_THREAD;i++){
            new firstPaChong().new MyThread().start();
        }
    }
    /**
     * 网页数据爬取
     * @param strurl
     * @param depth
     */
    public static void workurl(String strurl,int depth){
        //判断当前url是否爬取过
        if(!(alloverurl.contains(strurl)||depth>maxdepth)){
            //检测线程是否执行
            System.out.println("当前执行："+Thread.currentThread().getName()+" 爬取线程处理爬取："+strurl);
            //建立url爬取核心对象
            try {
                URL url=new URL(strurl);
                //通过url建立与网页的连接
                URLConnection conn=url.openConnection();
                //通过链接取得网页返回的数据
                InputStream is=conn.getInputStream();
                //提取text类型的数据
                if(conn.getContentType().startsWith("text")){

                }
                System.out.println(conn.getContentEncoding());
                //一般按行读取网页数据，并进行内容分析
                //因此用BufferedReader和InputStreamReader把字节流转化为字符流的缓冲流
                //进行转换时，需要处理编码格式问题
                BufferedReader br=new BufferedReader(new InputStreamReader(is,"gbk"));

                //按行读取并打印
                String line=null;
                //正则表达式的匹配规则提取该网页的链接
                Pattern p=Pattern.compile("<a id=\"pb_next\" href=.+</a>");//<a id="pb_next" href="/5/5155/[^\s]+.html">   <a .*href=.+</a>
                //建立一个输出流，用于保存文件,文件名为执行时间，以防重复
                //PrintWriter pw=new PrintWriter(new File(savepath+System.currentTimeMillis()+".txt"));

                while((line=br.readLine())!=null){
                    //System.out.println(line);
                    //编写正则，匹配超链接地址

                    contentBefor += line;
                    //pw.println(line);//按行向文件中存入数据
                    Matcher m=p.matcher(line);
                    while(m.find()){
                        String href=m.group();
                        //找到超链接地址并截取字符串
                        //有无引号
                        href=href.substring(href.indexOf("href="));
                        System.out.println("href====="+href);
                        if(href.charAt(5)=='\"'){
                            href=href.substring(6);
                        }else{
                            href=href.substring(5);
                        }
                        //截取到引号或者空格或者到">"结束
                        try{
                            href=href.substring(0,href.indexOf("\""));
                        }catch(Exception e){
                            try{
                                href=href.substring(0,href.indexOf(" "));
                            }catch(Exception e1){
                                href=href.substring(0,href.indexOf(">"));
                            }
                        }
                        //if(href.startsWith("http:")||href.startsWith("https:")){
                    /*
                    //输出该网页存在的链接
                    //System.out.println(href);
                    //将url地址放到队列中
                    allwaiturl.add(href);
                    allurldepth.put(href,depth+1);
                    */
                            //调用addurl方法
                            addurl("https://m.dingdianxs.com"+href,depth);
                        //}

                    }

                }
                //System.out.println("content===="+content);

                /**
                 * 每爬取完一次，就对爬取的数据做筛选处理
                 */
                String regex = "<div class=\"nr_title\" id=\"nr_title\">([^.])+</div>";//匹配章节名称的div
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(contentBefor);
                while (matcher.find()) {
                    //System.out.println("章节名称："+matcher.group());
                    String biaoti = matcher.group().substring(36,matcher.group().indexOf("("));//截取标题
                    if(!contentAfter.contains(biaoti)){//由于每一章分为两节这里在截取标题后在判断时候已经增加过本标题
                            contentAfter += biaoti+"\r\n";

                    }
//                    contentAfter+=matcher.group();
                }
                String regex2 = "<div id=\"nr1\">(.*?)</div>";//匹配正文的div
                Pattern pattern2 = Pattern.compile(regex2);
                Matcher matcher2 = pattern2.matcher(contentBefor);
                while (matcher2.find()) {
                    //System.out.println("正文+++++++++"+matcher2.group());

                    //String reg = "[^\u4e00-\u9fa5]";//正则匹配非汉字的,已废弃，整理后的标点符号全部丢失所以不用了
                    String content = matcher2.group().replaceAll("<div id=\"nr1\">", "");//手动整理
                    content = content.replaceAll("</div>","");
                    content = content.replaceAll("<br/>","\r\n");
                    content = content.replaceAll("-->>","");
                    content = content.replaceAll("-->","");
                    content = content.replaceAll("&nbsp;","");
                    content = content.replaceAll("（本章未完，请点击下一页继续阅读）","");//将多余的替换掉
                    contentAfter+=content+"\r\n";//标题与正文的换行
                    contentBefor="";//清空之前的数据重新添加未筛选过得
                }
//                System.out.println("contentBefor===="+contentBefor);
//                System.out.println("contentAfter===="+contentAfter);

//                String regex = "<div id=\"nr1\">([^.])+</div>";//匹配正文的div
//                Pattern pattern = Pattern.compile(regex);
//                Matcher matcher = pattern.matcher(contentBefor);
//                while (matcher.find()) {
//                    System.out.println(matcher.group());
//                    contentAfter+=matcher.group();
//                }
                //pw.close();
                br.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
            }
            //将当前url归列到alloverurl中
            alloverurl.add(strurl);
            System.out.println(strurl+"网页爬取完成，已爬取数量："+alloverurl.size()+"，剩余爬取数量："+allwaiturl.size());
        }
        /*
        //用递归的方法继续爬取其他链接
        String nexturl=allwaiturl.get(0);
        allwaiturl.remove(0);
        workurl(nexturl,allurldepth.get(nexturl));
        */
        if(allwaiturl.size()>0){
            synchronized(obj){
                obj.notify();
            }
        }else{
            try {
                PrintWriter pw=new PrintWriter(new File(savepath+System.currentTimeMillis()+".txt"));
                pw.println(contentAfter);
                pw.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("爬取结束.......");
//            System.out.println("contentBefor===="+contentBefor);
//            System.out.println("contentAfter===="+contentAfter);
        }

    }
    /**
     * 将获取的url放入等待队列中，同时判断是否已经放过
     * @param href
     * @param depth
     */
    public static synchronized void addurl(String href,int depth){
        //将url放到队列中
        allwaiturl.add(href);//"https://m.dingdianxs.com"+
        System.out.println("allwaiturl===="+allwaiturl);
        //判断url是否放过
        if(!allurldepth.containsKey(href)){
            allurldepth.put(href, depth+1);
            System.out.println("allurldepth===="+allurldepth);
        }
    }
    /**
     * 移除爬取完成的url，获取下一个未爬取得url
     * @return
     */
    public static synchronized String geturl(){
        String nexturl=allwaiturl.get(0);
        allwaiturl.remove(0);
        return nexturl;
    }
    /**
     * 线程分配任务
     */
    public class MyThread extends Thread{
        @Override
        public void run(){
            //设定一个死循环，让线程一直存在
            while(true){
                //判断是否新链接，有则获取
                if(allwaiturl.size()>0){
                    //获取url进行处理
                    String url=geturl();
                    //调用workurl方法爬取
                    workurl(url,allurldepth.get(url));
                }else{
                    System.out.println("当前线程准备就绪，等待连接爬取："+this.getName());
                    //建立一个对象，让线程进入等待状态，即wait（）
                    synchronized(obj){
                        try{
                            obj.wait();
                        }catch(Exception e){

                        }
                    }
                }
            }
        }

    }
}