package Medium;

public class RandomizedSetDriver{
    public static void main(String[] args) {
        RandomizedSet testSet = new RandomizedSet();
        System.out.println(testSet.insert(1));
        System.out.println(testSet.remove(2));
        System.out.println(testSet.insert(2));
        System.out.println(testSet.getRandom());
        System.out.println(testSet.remove(1));
        System.out.println(testSet.insert(2));
        System.out.println(testSet.getRandom());
    }
}
