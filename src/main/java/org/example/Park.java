public class Park {
    class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10:00 - 22:00", 150);
        Park.Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "11:00 - 20:00", 100);
        Park.Attraction hauntedHouse = park.new Attraction("Haunted House", "12:00 - 18:00", 200);

        rollerCoaster.printAttractionInfo();
        ferrisWheel.printAttractionInfo();
        hauntedHouse.printAttractionInfo();
    }
}
