package playerEnum;

public class PlayerTest {
  public static void main(String[] args) {
    // 1. Constructor 1
    Player lamineYamal = new Player("Lamine", "Yamal", Sex.MAN, Team.FCB, Position.FORWARD);

    // 2. Constructor 2
    Player lionelMessi = new Player("Lionel", "Messi", (byte) 36, Sex.MAN, Team.FCB, Position.FORWARD);

    // 3. Constructor 3
    Player rodrigoGoes = new Player("Rodrigo", "Goes", 1.73f, 75, Team.RM, Position.FORWARD);

    // 4. Constructor 4
    Player dusanVlahovic = new Player("Dusan", "Vlahovic", 1.90f, 88, (byte) 26, Sex.MAN, 100, Team.JUV, Position.FORWARD, true);

    // 5. Test increasePoints with 100 for an active player, it should be TRUE
    // Check points after calling the method
    System.out.println(lamineYamal.increasePoints(100));
    System.out.println(lamineYamal.getPoints());

    // 6. Test increasePoints for an inactive player, it should be FALSE
    // Check points of player are the same before and after calling the method
    lamineYamal.setActive(false);
    System.out.println(lamineYamal.increasePoints(100));

    // 7. Test decreasePoints (5 points) for a player with enough points (100)
    // Check points of player are 95 after calling the method;
    System.out.println(dusanVlahovic.decreasePoints(5));
    System.out.println(dusanVlahovic.getPoints());

    // 8. Test decreasePoints (150 points) for a player with (95 points), it should
    // be TRUE
    // Check points of player are 0 after calling the method;
    System.out.println(dusanVlahovic.decreasePoints(150));
    System.out.println(dusanVlahovic.getPoints());

    // 9. Test decreasePoints of a player with negative number (-15), it should be
    // FALSE
    // Check points of player are the same before and after calling the method
    System.out.println(rodrigoGoes.decreasePoints(-15));
    System.out.println(rodrigoGoes.getPoints());

    // 10. Test decrease points of an inactive player, it should be FALSE
    // Check points of player has not changed after calling the method
    lionelMessi.setActive(false);
    System.out.println(lionelMessi.decreasePoints(50));
    System.out.println(lionelMessi.getPoints());

    // 11. Test giveCard() to an active player with 0 cards, it should be true
    // Check cards after calling method
    lionelMessi.setActive(true);
    System.out.println(lionelMessi.getCards());
    System.out.println(lionelMessi.giveCard());

    // 12. Test giveCard() to an active player with 1 cards, it should be true
    // Check cards after calling method
    lamineYamal.setActive(true);
    lamineYamal.setCards((byte) 1);
    System.out.println(lamineYamal.giveCard());
    System.out.println(lamineYamal.getCards());

    // 13. Test giveCard() to an active player with 2 cards, it should be false
    // Check cards after calling method
    dusanVlahovic.setCards((byte) 2);
    System.out.println(dusanVlahovic.giveCard());
    System.out.println(dusanVlahovic.getCards());

    // Getters
    // 14. getName
    System.out.println(dusanVlahovic.getName());

    // 15. getSurname
    System.out.println(lionelMessi.getSurname());

    // 16. getHeight
    System.out.println(lamineYamal.getHeight());

    // 17. getWeight
    System.out.println(rodrigoGoes.getWeight());

    // 18. getAge
    System.out.println(rodrigoGoes.getAge());

    // 19. getSex
    System.out.println(lamineYamal.getSex());

    // 20. getTeam
    System.out.println(lionelMessi.getTeam());

    // 21. getTeam -> getName
    System.out.println(lionelMessi.getTeam().getName());

    // 22. getTeam -> getCountry
    System.err.println(lionelMessi.getTeam().getCountry());

    // 23. getPosition
    System.out.println(rodrigoGoes.getPosition());

    // 24. getPoints
    System.out.println(rodrigoGoes.getPoints());

    // 25. getCards
    System.out.println(rodrigoGoes.getCards());

    // 26. isActive
    System.out.println(rodrigoGoes.isActive());

    // Setters
    // 27. setName
    lionelMessi.setName("Leo");
    System.out.println(lionelMessi.getName());

    // 28. setSurname
    lionelMessi.setName("Cuchitini");
    System.out.println(lionelMessi.getSurname());

    // 29. setHeight
    lamineYamal.setHeight(1.80f);
    System.out.println(lamineYamal.getHeight());

    // 30. setWeight
    lamineYamal.setWeight(77f);
    System.out.println(lamineYamal.getWeight());

    // 31. setAge
    lamineYamal.setAge((byte) 19);
    System.out.println(lamineYamal.getAge());

    // 32. setTeam
    lamineYamal.setTeam(Team.PSG);
    System.out.println(lamineYamal.getTeam());

    // 33. setPosition
    lamineYamal.setPosition(Position.MIDFIELDER);
    System.out.println(lamineYamal.getPosition());

    // 34. setPoints
    rodrigoGoes.setPoints(10);
    System.out.println(rodrigoGoes.getPoints());

    // 35. setActive
    rodrigoGoes.setActive(false);
    System.out.println(rodrigoGoes.isActive());
  }

}
