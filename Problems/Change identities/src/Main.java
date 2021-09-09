class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {

        String p1TempName = p1.name;
        int p1TempAge = p1.age;
        String p2TempName = p2.name;
        int p2TempAge = p2.age;


        p1.name = p2TempName;
        p1.age = p2TempAge;

        p2.name = p1TempName;
        p2.age = p1TempAge;

    }
}