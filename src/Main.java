public class Main {
    public static void main(String args[]) {
        Queue queue = new Queue(8);
        int[] data = {1, 2, 3, 4, 5, 6};
        int[] secondData = {7, 8 , 9};

        for(int d: data) {
            try {
                queue.add(d);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        queue.display();
        System.out.println("-------------------------");

        for(int i=0;i<3;i++) {
            try {
                System.out.println(queue.remove());
            } catch(Exception e) {
                System.out.println(e);
            }
        }

        queue.display();
        System.out.println("-------------------------");

        for(int d: secondData) {
            try {
                queue.add(d);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        queue.display();
        System.out.println("-------------------------");

    }
}
