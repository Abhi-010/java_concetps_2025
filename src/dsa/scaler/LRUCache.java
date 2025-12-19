package scaler_questions.Scaler;

import java.util.HashMap;

import java.util.List;
public class LRUCache {
    class ListNode{
        int key ;
        int value;
        ListNode next;
        ListNode prev ;
        ListNode(int key1, int data){
            key = key1 ;
            value = data ;
            next = null ;
            prev = null ;
        }
    }
    int capacity ;   ;
    HashMap<Integer, ListNode> hm = new HashMap<>() ;
    ListNode head = new ListNode(-1,-1) ;
    ListNode last = head ;
    public LRUCache(int capacity) {
        this.capacity = capacity ;
    }
    public static void main(String[] args){

        LRUCache obj = new LRUCache(12) ;
        obj.set(5,15);
        obj.set(11,19);
        obj.set(9,1);
        System.out.print(obj.get(9) + " ");

        obj.set(13,3);
        obj.set(3,6);
        System.out.print(obj.get(13) + " ");

        System.out.print(obj.get(4) + " ");

        System.out.print(obj.get(2) + " ");
        System.out.print(obj.get(10) + " ");
        System.out.print(obj.get(7) + " ");
        obj.set(11,14);

        System.out.print(obj.get(2) + " ");
        System.out.print(obj.get(4) + " ");
        obj.set(9,5);
        System.out.print(obj.get(5) + " ");
        System.out.print(obj.get(6) + " ");
        System.out.print(obj.get(6) + " ");
        obj.set(13,1);
        System.out.print(obj.get(12) + " ");
        System.out.print(obj.get(13) + " ");
        obj.set(14,4);
        obj.set(3,13);
        obj.set(4,14);
        obj.set(7,3);

        obj.set(9,7);
        obj.set(10,4);
        obj.set(12,13);
        System.out.print(obj.get(14) + " ");
        obj.set(7,8);
        obj.set(9,12);
        System.out.print(obj.get(9) + " ");

        System.out.println();

        System.out.println("start");
         ListNode temp = obj.head ;
        while(temp != null){
            System.out.print(temp.key + " " + temp.value + " ; ");
            temp = temp.next ;
        }
        System.out.println("end");
        System.out.println("size of hashmap is " + obj.hm.size());
        for (Integer i : obj.hm.keySet())
            System.out.println("key: " + i);

        for (ListNode node : obj.hm.values())
            System.out.println("value : " + node.value) ;

        /*
        obj.set(8,14);
        obj.set(9,5);
        obj.set(5,9);

        temp = obj.head ;
        while(temp != null){
            System.out.print(temp.key + " " + temp.value + " ; ");
            temp = temp.next ;
        }
        System.out.println("end");

         */

    }
       // System.out.println("Size of HashMap is " + obj.hm.size());
       // System.out.print(obj.get(3) + " ");
       // System.out.print(obj.get(11) + " ");
        //System.out.println(obj.get(12));
/*
        for (Integer i : obj.hm.keySet())
            System.out.println("key: " + i);

        for (ListNode node : obj.hm.values())
            System.out.println("value : " + node.value) ;

 */

    public int get(int key) {
        if(hm.containsKey(key)){
            ListNode tempNode = hm.get(key) ;
            if(tempNode.next != null){
                tempNode.prev.next = tempNode.next ;
                tempNode.next.prev = tempNode.prev ;
                //insert at back
                last.next = tempNode ;
                tempNode.prev = last ;
                tempNode.next = null ;
                last = tempNode ;
            }
            return tempNode.value ;
        }
        return -1 ;
    }

    public void set(int key, int value) {
        //Case 1 : key is already present in HM
        //Case 2 : key is not present in HM
        ListNode newNode = new ListNode(key,value) ;
        if(!hm.containsKey(key)){
            //check the capacity
           // System.out.println("size " + hm.size() + " cap :  " + capacity );
            if(hm.size() < capacity){

            }
            else{
                //capacity is equal to the size of HM
                //remove the first element in DLL
                //Case a : Only one element
                //Case b : More that one element
                if(head.next.next == null){
                    ListNode temp = head.next ;
                    hm.remove(temp.key);
                    head.next = null ;
                    last = head ;
                }
                else {
                    ListNode tempNode = head.next ;
                    hm.remove(tempNode.key);
                    head.next = tempNode.next ;
                    tempNode.next.prev = head ;
                }
            }
        }
        else{
            //Case a : only one Element
            //Case b : More than one Element
            if(head.next.next == null){
                hm.remove(key);
                head.next = null ;
                last = head ;
            }
            else {
                ListNode tempNode = hm.get(key) ;
                hm.remove(key);
                //tempNode might be the first element
                if(tempNode.prev == head){
                    head.next = tempNode.next ;
                    tempNode.next.prev = head ;
                }
                else if(tempNode.next == null){
                    last = tempNode.prev ;
                    last.next = null ;
                }
                else {
                    tempNode.prev.next = tempNode.next ;
                    tempNode.next.prev = tempNode.prev ;
                }
            }
        }
        //insert at back
        last.next = newNode ;
        newNode.prev = last ;
        last = newNode ;
      //  System.out.println("Key : " + newNode.key + " value " + newNode.value);
        hm.put(key,newNode) ;
    }
}
