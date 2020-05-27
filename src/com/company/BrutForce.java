package com.company;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrutForce {
    int n;
    public BrutForce(int n)
    {
        this.n=n;
    }
    private String sha_1="1115dd800feaacefdf481f1f9070374a2a81e27880f187396db67958b207cbad";
    private String sha_2="3a7bd3e2360a3d29eea436fcfb7e44c735d117c42d1c1835420b6b9942dd4f1b";
    private String sha_3="74e1bb62f8dabb8125a58852b63bdf6eaef667cb56ac7f7cdba6d7305c50a22f";

    private String sha_hash(String password) throws NoSuchAlgorithmException {
        byte[] pass=password.getBytes();
        MessageDigest md= MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(pass);
        byte[] hash=md.digest();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<hash.length; i++)
        {
            String s = Integer.toHexString(0xff & hash[i]);
            s = (s.length() == 1) ? "0" + s : s;
            sb.append(s);
        }
        return sb.toString();
    }

    public void brutforce() throws NoSuchAlgorithmException {
        String sha;
        String pswd;
        switch(n)
        {
            case 1:
            {
                for (char b1='a'; b1<='i'; b1++)
                    for (char b2='a'; b2<='z'; b2++)
                        for (char b3='a'; b3<='z'; b3++)
                            for (char b4='a'; b4<='z'; b4++)
                                for (char b5='a'; b5<='z'; b5++)
                                {
                                   pswd=String.valueOf(b1)+String.valueOf(b2)+String.valueOf(b3)+String.valueOf(b4)+String.valueOf(b5);
                                   sha=sha_hash(pswd);
                                   if (sha.equals(sha_1))
                                       System.out.println(pswd+" "+sha_1);
                                   if (sha.equals(sha_2))
                                       System.out.println(pswd+" "+sha_2);
                                   if (sha.equals(sha_3))
                                       System.out.println(pswd+" "+sha_3);
                                }
                break;
            }
            case 2:
            {
                for (char b1='j'; b1<='r'; b1++)
                    for (char b2='a'; b2<='z'; b2++)
                        for (char b3='a'; b3<='z'; b3++)
                            for (char b4='a'; b4<='z'; b4++)
                                for (char b5='a'; b5<='z'; b5++)
                                {
                                    pswd=String.valueOf(b1)+String.valueOf(b2)+String.valueOf(b3)+String.valueOf(b4)+String.valueOf(b5);
                                    sha=sha_hash(pswd);
                                    if (sha.equals(sha_1))
                                        System.out.println(pswd+" "+sha_1);
                                    if (sha.equals(sha_2))
                                        System.out.println(pswd+" "+sha_2);
                                    if (sha.equals(sha_3))
                                        System.out.println(pswd+" "+sha_3);
                                }
                break;
            }
            case 3:
            {
                for (char b1='s'; b1<='z'; b1++)
                    for (char b2='a'; b2<='z'; b2++)
                        for (char b3='a'; b3<='z'; b3++)
                            for (char b4='a'; b4<='z'; b4++)
                                for (char b5='a'; b5<='z'; b5++)
                                {
                                    pswd=String.valueOf(b1)+String.valueOf(b2)+String.valueOf(b3)+String.valueOf(b4)+String.valueOf(b5);
                                    sha=sha_hash(pswd);
                                    if (sha.equals(sha_1))
                                        System.out.println(pswd+" "+sha_1);
                                    if (sha.equals(sha_2))
                                        System.out.println(pswd+" "+sha_2);
                                    if (sha.equals(sha_3))
                                        System.out.println(pswd+" "+sha_3);
                                }
                break;
            }
        }
    }

}
