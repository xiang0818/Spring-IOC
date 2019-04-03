package com.leetcode;

import java.util.ArrayList;

/**
 * @program: Spring-IOC
 * @description:
 * @author: Mr.Luo
 * @create: 2019-03-29 14:22
 **/
public class singlylinked {



        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


            ListNode resule;
            while(l1.getNext()!=null){
                if(l1.getVal()>l2.getVal()){
                    resule= l2.getNext();
                    l2.setNext(l1);
                }
            }

            return l2;
        }


        public ListNode text(ListNode l1, ListNode l2){


            return null;
        }
}
