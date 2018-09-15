package ie.distilledsch.codekata;

import java.util.Arrays;
import java.util.List;

public class Song {

    private List<Animal> animals;

    public Song() {
        this(Arrays.asList(
                new Animal("fly", "I don't know why she swallowed a fly - perhaps she'll die!"),
                new Animal("spider", "That wriggled and wiggled and tickled inside her."),
                new Animal("bird", "How absurd to swallow a bird."),
                new Animal("cat", "Fancy that to swallow a cat!"),
                new Animal("dog", "What a hog, to swallow a dog!"),
                new Animal("cow", "I don't know how she swallowed a cow!"),
                new Animal("horse", "She's dead, of course!")
        ));
    }

    public Song(List<Animal> animals) {
        this.animals = animals;
    }

    public String sing() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int verseIndex = 0; verseIndex < animals.size(); verseIndex++) {
            if (verseIndex == 0) {
                stringBuilder.append(singFirstVerse()).append("\n");
            }
            else if (verseIndex == animals.size() - 1) {
                stringBuilder.append(singLastVerse());
            }
            else {
                stringBuilder.append(singVerse(verseIndex)).append("\n");
            }
        }

        return stringBuilder.toString();
    }

    public String singFirstVerse() {
        StringBuilder stringBuilder = new StringBuilder();

        Animal verseAnimal = animals.get(0);

        stringBuilder.append("There was an old lady who swallowed a ").append(verseAnimal.getName()).append(".\n");
        stringBuilder.append(verseAnimal.getLine()).append("\n");

        return stringBuilder.toString();
    }

    public String singVerse(int verseIndex) {
        StringBuilder stringBuilder = new StringBuilder();

        Animal verseAnimal = animals.get(verseIndex);

        stringBuilder.append("There was an old lady who swallowed a ").append(verseAnimal.getName()).append(";\n");
        stringBuilder.append(verseAnimal.getLine()).append("\n");
        for (int animalIndex = verseIndex; animalIndex > 0; animalIndex--) {
            Animal animal = animals.get(animalIndex);
            Animal previousAnimal = animals.get(animalIndex - 1);

            stringBuilder.append("She swallowed the ").append(animal.getName()).append(" to catch the ").append(previousAnimal.getName());
            stringBuilder.append(animalIndex == 1 ? ";" : ",");
            stringBuilder.append("\n");
        }

        stringBuilder.append(animals.get(0).getLine()).append("\n");

        return stringBuilder.toString();
    }

    public String singLastVerse() {
        StringBuilder stringBuilder = new StringBuilder();

        Animal verseAnimal = animals.get(animals.size() - 1);

        stringBuilder.append("There was an old lady who swallowed a ").append(verseAnimal.getName()).append("...\n");
        stringBuilder.append("...").append(verseAnimal.getLine());

        return stringBuilder.toString();
    }
}
