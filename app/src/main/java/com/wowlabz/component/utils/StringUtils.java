package com.wowlabz.component.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.List;

public class StringUtils {
    public static final String EMPTY = "";
    protected static final char[] hexArray = "0123456789abcdef".toCharArray();

    public StringUtils() {
    }

    public static String join(List<String> list, String separator) {
        return list == null?null:join(list.toArray(), separator, 0, list.size());
    }

    public static String join(Object[] array, String separator) {
        return array == null?null:join(array, separator, 0, array.length);
    }

    public static String join(Collection<String> collection, String separator) {
        return collection == null?null:join(collection.toArray(new String[collection.size()]), separator, 0, collection.size());
    }

    public static String join(Object[] array, String separator, int startIndex, int endIndex) {
        if(array == null) {
            return null;
        } else {
            if(separator == null) {
                separator = "";
            }

            int noOfItems = endIndex - startIndex;
            if(noOfItems <= 0) {
                return "";
            } else {
                StringBuilder buf = new StringBuilder(noOfItems * 16);

                for(int i = startIndex; i < endIndex; ++i) {
                    if(i > startIndex) {
                        buf.append(separator);
                    }

                    if(array[i] != null) {
                        buf.append(array[i]);
                    }
                }

                return buf.toString();
            }
        }
    }

    public static String encodeHexString(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];

        for(int j = 0; j < bytes.length; ++j) {
            int v = bytes[j] & 255;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 15];
        }

        return new String(hexChars);
    }

    public static String escapeHtml(String input) {
        return HtmlEscape.escapeTextArea(input);
    }

    public static boolean isNotBlank(Object input) {
        return input == null?false:!isBlank(input.toString());
    }

    public static boolean isNotBlank(String input) {
        return !isBlank(input);
    }

    public static boolean isEmpty(String input) {
        return input == null || input.length() == 0;
    }

    public static boolean isBlank(String input) {
        int strLen;
        if(input != null && (strLen = input.length()) != 0) {
            for(int i = 0; i < strLen; ++i) {
                if(!Character.isWhitespace(input.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static String read(InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        boolean length = false;

        int length1;
        while((length1 = in.read(buffer)) != -1) {
            baos.write(buffer, 0, length1);
        }

        return new String(baos.toByteArray());
    }
}