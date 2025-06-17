package ch15;

import java.util.Arrays;

public class MyArrayList {
	private String[] arr = new String[0];

	public int size(){
		return this.arr.length;
	}
	public void add(String str){
		String[] temp = new String[size()+1];
		temp[size()] = str;
		// 기존값 복사
		for (int i = 0; i < size(); i++){
			temp[i] = arr[i];
		}
		this.arr = temp;
	}
	public void add(int idx, String str){
		String[] temp = new String[size() + 1];
		temp[idx] = str;
		for (int i = 0; i < size(); i++){
			temp[i < idx ? i : i+1] = arr[i];
		}
		this.arr = temp;
	}
	public String remove() {
		String[] temp = new String[size() - 1];
		String removedStr = this.arr[temp.length];
		for (int i = 0 ; i < temp.length; i++){
			temp[i] = this.arr[i];
		}
		this.arr = temp;
		return removedStr;
	}
	public String remove(int idx){
		String[] temp = new String[size() - 1];
		String removeStr = this.arr[idx];
		for (int i = 0; i < temp.length; i++){
			temp[i] = arr[i < idx ? i : i + 1];
		}
		this.arr = temp;
		return removeStr;
	}

	public void checkValues(){
		System.out.println(Arrays.toString(this.arr));
	}
	public String get(int idx){
		return this.arr[idx];
	}
}
