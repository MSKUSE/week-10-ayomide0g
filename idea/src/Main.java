public class Main {
    public static void main(String[] args)
    {
        /*Stack stack = new StackArray();
        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println("pop2 = " + stack.pop());
        stack.peek();
        System.out.println("pop1 = " + stack.pop());
        System.out.println("Is empty " + stack.isEmpty());
        stack.peek();
        System.out.println("pop1 = " + stack.pop());*/

        StackLinkedList stack = new StackLinkedList();
        stack.peek();
        stack.push(5);
        stack.push("It is a string");
        stack.peek();
        System.out.println(stack.top.getItem());
        System.out.println(stack.top.getNext().getNext());
    }
}
