

class Room {
    public int tables;
    public long chairs;
    public int students;
    public long computers;


    public Room(int amttables, long amtchairs) {
        tables = amttables;
        chairs = amtchairs;
    }

    public Room(int amttables, long amtchairs, int amtstudents) {
        tables = amttables;
        chairs = amtchairs;
        students = amtstudents;
    }
    public Room(int amttables, long amtchairs, int amtstudents, long amtcomputers) {
        tables = amttables;
        chairs = amtchairs;
        students = amtstudents;
        computers = amtcomputers;
    }

    public String getInfo() {
        return String.format("There are %d tables, and %d chairs in the classroom. %n We are expecting" +
                "about %d students here with hopefully %d computers, so no extra ones are going to " +
                "be needed", tables, chairs, students, computers);
    }

    public static void main(String[] args) {
        Room day1 = new Room(20, 20);
        Room day2 = new Room(20, 20);
        Room day3 = new Room(20, 20, 20);
        Room day4 = new Room(20, 20, 20, 20);
        System.out.println(day1.getInfo());
        System.out.println(day2.getInfo());
        System.out.println(day3.getInfo());
        System.out.println(day4.getInfo());
    }
}
