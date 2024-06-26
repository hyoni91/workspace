

public class Restaurant {

        private Chef chef;

        public Restaurant(){
            chef = new Chef();
        }

        public void service(){
            System.out.println("open serve");
            chef.makeCook();
        }

}
