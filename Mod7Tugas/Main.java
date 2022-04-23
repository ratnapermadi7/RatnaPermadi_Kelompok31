package Mod7Tugas;
import java.util.Scanner;

class Stack {
    private int size, capacity, top, count;
    private Object[] data;

    public Stack(int size) {
        top = -1;
        capacity = size;
        count = 0;
        data = new Object[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(Object S) {
        if (isFull()) {
            System.out.println("Stack penuh!!");
        } else {
            data[++top] = S;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!!");
            return 0;
        }
        return data[top--];
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.print("Data dalam stack : ");
            for (int i = top; i >= 0; i--) {
                System.out.print(data[i]+" ");
            }
        }
    }
}
class Queue {
    private Object[] data;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        data = new Object[size];
        capacity = size;
        rear = -1;
        front = 0;
        count = 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(Object x) {
        if (isFull()) {
            System.out.println("Queue Penuh!!!");
        } else {
            rear = (rear + 1) % capacity;
            data[rear] = x;
            count++;
        }
    }

    public Object dequeue() {
        if (isEmpty()) {

            System.out.println("Queue Kosong!!!");
            return 0;
        }
        Object x = data[front];
        front = (front + 1) % capacity;
        count--;
        return x;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue Kosong!!!");
        } else {
            System.out.print("Data Dalam Queue : ");
            for (int i = 0; i < count; i++) {
                System.out.print(data[(front + i) % capacity] +
                        " ");
            }
            System.out.println();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(100);
        Queue que = new Queue(100);

        System.out.println("===========================");
        System.out.println("===PROGRAM STACK & QUEUE===");
        System.out.println("===========================");

        while(true) {
            System.out.println("1. Tambah Data (String)\n2. Tampil Data Stack\n3. Tampil Data Queue\n4. Hapus data Stack(Pop Data)\n5. Hapus Data Queue(Dequeue Data)\n6.Exit");
            System.out.println("===========================");
            System.out.print("Masukkan pilihan : ");

            int pil = Integer.parseInt(sc.nextLine());

            if (pil == 1) {
                System.out.print("Tambah data : ");
                String input = sc.nextLine().replaceAll("\\s+","");
                System.out.println("");
                char[] data = input.toCharArray();

                if(data.length<=7) {
                    for (char datum : data) {
                        stack.push(datum);
                    }
//                    for (int i = 0; i < data.length; i++) {
//                        stack.push(data[i]);
//                    }

                } else if (data.length>=7){
                    for (char datum : data) {
                        que.enqueue(datum);
                    }
                }

                System.out.println();
            }
            else if (pil == 2) {
                stack.printStack();
                System.out.println();
            }
            else if(pil ==3){
                que.printQueue();
                System.out.println();
            }
            else if(pil ==4){
                System.out.print("pop data sebanyak : ");
                int pop = sc.nextInt();
                for (int i = 0; i < pop; i++) {
                    stack.pop();
                }
//                stack.printStack();
                System.out.println();
            }
            else if (pil == 5){
                System.out.print("dequeue data sebanyak : ");
                int dequeue = sc.nextInt();
                for (int i = 0; i <dequeue ; i++) {
                    que.dequeue();
                }
            }
            else if (pil == 6){
                System.out.print("Exit...");
                System.exit(0);
            }
        }


    }
}

