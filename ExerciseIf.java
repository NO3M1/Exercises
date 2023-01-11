public class ExerciseIf {
    public static void main(String[] args){
        // Revista cu animale
        String[] animals = new String[] {"cat", "dog", "pig", "horse"};
        for(int i = 0; i < animals.length; i++) {
            System.out.println("La pagina " + (i+1) + " avem animalul " + animals[i]);
        }
        System.out.println("");

        int i = 1;
        for(String animal : animals) {
            System.out.println("La pagina " + i + " avem animalul " + animal);
            ++i;
        }
    }
}
