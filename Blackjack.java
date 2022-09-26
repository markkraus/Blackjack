public class Blackjack  {
    public static int dealerWins = 0;
    public static int playerWins = 0;
    public static int ties = 0;

        public static void main(String[] args)  {
            int rounds = Integer.parseInt(args[0]);
            int shoes = Integer.parseInt(args[1]);
            int trace = Integer.parseInt(args[2]);
            BlackjackCards deck =  generateDeck(shoes);



            System.out.println("Starting Blackjack with" + rounds + " and " + shoes + " decks in the shoe");
            for(int i = 0; i < rounds; i++){

                System.out.println( " round " + i +" beginning");
                Card[]  playerHand = new Card[20];
                Card[]  dealerHand = new Card[20];
                playerHand[0] = deck.dequeue();
                dealerHand[0] = deck.dequeue();
                playerHand[1] = deck.dequeue();
                dealerHand[1] = deck.dequeue();
                System.out.println("Player: Contents: " + playerHand[0].toString() + playerHand[1].toString() + ": " + (playerHand[0].value() + playerHand[1].value() ));
                System.out.println("Dealer: Contents: " + dealerHand[0].toString() + dealerHand[1].toString() + ": " + (dealerHand[0].value() + dealerHand[1].value() ));
                gamePlay(playerHand, dealerHand, deck);
            }

        }

        public static void gamePlay(Card[] playerHand, Card[] dealerHand, BlackjackCards deck){
            int dealerValue = dealerHand[0].value() + dealerHand[1].value();
            int playerValue = playerHand[0].value() + playerHand[1].value();
            int counter = 2;
            boolean flag = false;
            while(playerValue < 17){
                Card tempCard = deck.dequeue();
                System.out.println(tempCard.toString());
                playerHand[counter] = tempCard;
                playerValue = playerValue + tempCard.value();
                counter++;


            }
            if(playerValue > 21){
                System.out.print("Player busts: Contents: ");
                flag = true;
                    for(int i = 0; i < playerHand.length; i++){
                        System.out.print(playerHand[i].toString());
                }
                System.out.print(" : " + playerValue);

            }
            while(dealerValue < 17){

                Card tempCard = deck.dequeue();
                System.out.println(tempCard.toString());
                dealerHand[counter] = tempCard;
                dealerValue = dealerValue + tempCard.value();

                counter++;

            }
            if(dealerValue > 21){
                System.out.print("Dealer busts: Contents: ");
                flag = true;
                for(int i = 0; i < dealerHand.length; i++){
                    System.out.print(dealerHand[i].toString());
                }
                System.out.print(" : " + dealerValue);

            }
            if(flag == false) {

                if (dealerValue < playerValue) {
                    System.out.println("Player Wins!");
                    playerWins = playerWins + 1;
                } else if (playerValue < dealerValue) {
                    System.out.println("Dealer Wins!");
                    dealerWins = dealerWins + 1;
                } else {
                    System.out.println("Push");
                    ties = ties + 1;
                }
            }
        }


   public static BlackjackCards generateDeck(int shoes){
            BlackjackCards deck = new BlackjackCards(52 * shoes);
            for(int i = 0; i < shoes; i++) {
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Two));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Two));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Two));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Two));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Three));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Three));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Three));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Three));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Four));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Four));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Four));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Four));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Five));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Five));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Five));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Five));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Six));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Six));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Six));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Six));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Seven));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Seven));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Seven));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Seven));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Eight));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Eight));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Eight));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Eight));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Nine));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Nine));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Nine));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Nine));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Ten));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Ten));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Ten));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Ten));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Jack));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Jack));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Jack));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Jack));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Queen));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Queen));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Queen));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Queen));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.King));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.King));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.King));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.King));
                deck.enqueue(new Card(Card.Suits.Diamonds, Card.Ranks.Ace));
                deck.enqueue(new Card(Card.Suits.Hearts, Card.Ranks.Ace));
                deck.enqueue(new Card(Card.Suits.Clubs, Card.Ranks.Ace));
                deck.enqueue(new Card(Card.Suits.Spades, Card.Ranks.Ace));
                //
            }
            deck.shuffle();
            return deck;
   }




}
