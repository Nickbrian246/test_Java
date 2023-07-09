public class PokeApi2 {
      String[] pokeNames = { "charmander", "pikachu", "bulbasaur", "pidget" };
      int[] pokePercentage = { 10, 1, 40, 49 };
      public void getPokemon(){
          int random = (int) (Math.random() * 100 + 1);

        System.out.println("mi numero es : " + random);

        if (random == 1) {

            System.out.println("tu pokemon es : " + pokeNames[1]);

        } else if (random > 1 && random <= 10) {

            System.out.println("tu pokemon es : " + pokeNames[0]);

        } else if (random >= 11 && random <= 51) {

            System.out.println("tu pokemon es : " + pokeNames[2]);

        } else if (random > 51) {

            System.out.println("tu pokemon es : " + pokeNames[3]);

        }
    }
      }
    

