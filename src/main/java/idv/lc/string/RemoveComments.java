package idv.lc.string;

import java.util.*;

public class RemoveComments {
    public List<String> removeComments(String[] source) {
        String whole = String.join("\n", source);
        whole = whole.replaceAll("//.*|/\\*(.|\n)*?\\*/", "");
        List<String> ans = new ArrayList<>();
        for(String str : whole.split("\n")) {
            if(!str.equals("")) {
                ans.add(str);
            }
        }
        return ans;
        /*
        while (whole.indexOf("//") != -1) {
            int c = whole.indexOf("//");
            int n = whole.indexOf("\n", c);
            System.out.println("-------------");
            System.out.println(c);
            System.out.println(n);
            whole = whole.substring(0, c) + whole.substring(n, whole.length());
        }*/
        //while (whole.indexOf("/*")!=-1&&whole.indexOf("*/")!=-1) {
        //    whole = whole.substring(0,whole.indexOf("/*"))
        //        + whole.substring(whole.indexOf("*/")+2, whole.length());
        //}
        //String[] res = Arrays.stream(whole.split("\n")).filter(x->x.length()>0).toArray(String[]::new);
        //return Arrays.asList(res);
    }

    public List<String> removeCommentsFAIL(String[] source) {
        boolean inComment = false;
        List<String> res = new ArrayList<>();
        for (String s : source) {
            if (s.indexOf("//") != -1) {
                s = s.substring(0, s.indexOf("//"));
            }
            int left = s.indexOf("/*");
            int right = s.indexOf("*/");
            if (left !=-1 && right != -1) {
                s = s.substring(0, left) + s.substring(right+2, s.length());
            } else if (left != -1) {
                inComment = true;
                s = s.substring(0, left);
            } else if (right != -1) {
                inComment = false;
                s = s.substring(right+2, s.length());
            } else {
                if (inComment) {
                    continue;
                }
            }
            if (s.length() > 0) {
                res.add(s);
            }
        }
        return res;
    }
}
