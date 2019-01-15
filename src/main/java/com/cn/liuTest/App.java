package com.cn.liuTest;

import com.baidu.ai.aip.auth.AuthService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AuthService authservice=new AuthService();
    	authservice.getAuth();
        System.out.println( "Hello World!" );
    }
}
