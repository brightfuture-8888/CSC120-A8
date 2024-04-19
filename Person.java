/* Create a class Person that is implemented Contract */
public class Person implements Contract {
    public void grab(String item) {
        System.out.println("Wow! You grab an apple!");
    }

    /* drop method to notify Person dropping thier apple */
    public String drop(String item) {
        System.out.println("Wait... You drop your apple");
        return item;
    }

    /* examine method to notify Person examining thier apple */
    public void examine(String item) {
        System.out.println("Your apple gets dirt on it... You examine if it is edible");
    }

    /* use method to notify Person to use the apple for thier apple pie */
    public void use(String item) {
        System.out.println("The apple is safe! You can use it to bake an apple pie!");
    }

    /*
     * walk method to notify Person to walk to the north. Otherwise, Person goes on
     * wrong direction
     */
    public boolean walk(String direction) {
        if (direction.equalsIgnoreCase("north")) {
            System.out.println("You are going to north!");
            return true;
        } else {
            System.out.println("You are not going to north... Wrong direction!");
            return false;
        }
    }

    /*
     * If x and y are greater than 0, Person is flying to home. Other wise, Person
     * is flying to Mars
     */
    public boolean fly(int x, int y) {
        if (x >= 0 && y >= 0) {
            System.out.println("You are flying to home!!!!");
            return true;
        } else {
            System.out.println("You are flying to Mars!!!!!");
            return false;
        }
    }

    /* size 12 T shirt shrinks by 3 inches */
    public Number shrink() {
        int howMuchTshirtShrinks = 12;

        if (howMuchTshirtShrinks >= 12) {
            System.out.println("My size 12 T-shirt keeps shrinking by 3 inches... Did I get to an wonderland?" + " "
                    + "Seems like this place is a wonderland...");
        } else {
            howMuchTshirtShrinks = howMuchTshirtShrinks - 3;
            System.out.println("Shrinks until when it's gone!");
        }
        return 0;
    }

    /* A plant grows 4 inches */
    public Number grow() {
        int plant = 0;

        if (plant >= 0) {
            plant = plant + 4;
            System.out.println("You found a green little baby plant on the ground. Let's grow it by 4 inches!");
        }
        return 20;
    }

    /* Person takes a rest */
    public void rest() {
        System.out.println("You need a rest. Rest under this tree.");
    }

    /* Person finds their A4 under the tree and undo the error they made on it */
    public void undo() {
        System.out.println("You found your A4 under the tree! Let's try undo the error you made on it!");
    }

    /**
     * Run Contract
     * 
     * @param args
     */
    public static void main(String[] args) {
        Person Contract = new Person();
        System.out.println();
        Contract.grab("apple");
        Contract.drop("apple");
        Contract.examine("apple");
        Contract.use("apple");
        Contract.walk("north");
        Contract.fly(0, 0);
        Contract.shrink();
        Contract.grow();
        Contract.rest();
        Contract.undo();
    }
}