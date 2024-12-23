package com.example.demo.interview;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return result;
        }
        List<Integer> tempList = new ArrayList<>();
        return pick(nums, result, tempList);
    }

    public static List<List<Integer>> pick(int[] nums, List<List<Integer>> result, List<Integer> tempList){
        if(tempList.size() == nums.length){
            result.add(new ArrayList<>(tempList));
        }else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])){
                    continue;
                }else{
                    tempList.add(nums[i]);
                    pick(nums, result, tempList);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
        return result;
    }
}
