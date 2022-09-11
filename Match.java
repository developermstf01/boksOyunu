public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run(){
       double random1 = Math.random() * 100;
       double random2 = Math.random() * 100;
       if (random1 > random2){
           System.out.println(this.f1.name+" başladı !");
           fight1();
       }
       if (random2 > random1){
           System.out.println(this.f2.name+" başladı !");
           fight2();
       }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name+" kazandı !");
            return true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name+" kazandı !");
            return true;
        }
        return false;
    }

    void fight1(){
        if(isCheck()){

            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("========YENİ ROUND========");
                this.f2.health = f1.hit(f2);
                if(isWin()){
                    break;
                }

                this.f1.health = f2.hit(f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name+ " Sağlık: "+this.f1.health);
                System.out.println(this.f2.name+ " Sağlık: "+this.f2.health);
            }

        }else {
            System.out.println("Dövüşçülerin sikletleri farklı !");
        }
    }
    void fight2(){
        if(isCheck()){

            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("========YENİ ROUND========");
                this.f1.health = f2.hit(f1);
                if(isWin()){
                    break;
                }

                this.f2.health = f1.hit(f2);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name+ " Sağlık: "+this.f1.health);
                System.out.println(this.f2.name+ " Sağlık: "+this.f2.health);
            }

        }else {
            System.out.println("Dövüşçülerin sikletleri farklı !");
        }
    }
}