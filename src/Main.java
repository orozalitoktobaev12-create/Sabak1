//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public void main() {
                Animal animal = new Animal();
                Animal[] animals={animal};
                for(Animal  a:animals){
                animal.domas();
                System.out.println(a instanceof Animal);
                System.out.println(getClass());
            }


            System.out.println("~~~~~~~~~~~~~~~~~");
            Shark shark = new Shark();
            Shark [] sharks={shark};
            for(Shark s:sharks){
            shark.attack();
            System.out.println(s instanceof Shark);
            System.out.println(s.getClass());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

        }


            Turtle turtle = new Turtle();
            Turtle [] turtles={turtle};
            for (Turtle t:turtles ){
            turtle.swim();
            System.out.println(t instanceof Animal);
            System.out.println(t.getClass());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       }

            Eagle eagle = new Eagle();
            Eagle[] eagles = {eagle};
            for(Eagle e : eagles){
            eagle.fly();
            System.out.println(e instanceof Animal);
            System.out.println(e.getClass());

     }

    }

