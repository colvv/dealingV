package com.vv.dealingV.utils;

public class PubFun {
	public static final int SB_DEFAULT_SIZE = 128;
	public static final char SYS_SPLIT_OBJECT = '^';
	public static final char SYS_SPLIT_PARAM = '|';
	
	/**
	 *  ����Ĭ�ϵ�Stringbuilder����ҪΪ�˽��Ƶ����������
	 * @return
	 */
	public static StringBuilder init_StringBuilder() {
		return new StringBuilder(PubFun.SB_DEFAULT_SIZE);
	}
	/**
	 *  �﷨�ǰ�������ƴ���ַ���
	 * @return
	 */
	public static String getStr(String... strs) {
        StringBuilder s_Result  = PubFun.init_StringBuilder();
        if(strs != null && strs.length > 0) {
            for(String str : strs) {
            	s_Result.append(str);
            }
        }
        return s_Result.toString();
    }
}
