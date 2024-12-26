package playerEnum;

public class Player {
  private String name;
  private String surname;
  private float height;
  private float weight;
  private byte age = 18;
  private Sex sex = Sex.NOTDEFINED;
  private int points = 100;
  private Team team;
  private Position position;
  private boolean active = true;
  private byte cards = 0;

  public Player(String name, String surname, float height, float weight, byte age, Sex sex, int points, Team team,
      Position position, boolean active) {
    this.name = name;
    this.surname = surname;
    this.height = height;
    this.weight = weight;
    this.age = age < 18 ? 18 : age;
    this.sex = sex;
    this.points = points < 100 ? 100 : points;
    this.team = team;
    this.position = position;
    this.active = active;
  }

  public Player(String name, String surname, float height, float weight, Team team, Position position) {
    this.name = name;
    this.surname = surname;
    this.height = height;
    this.weight = weight;
    this.team = team;
    this.position = position;
  }

  public Player(String name, String surname, Sex sex, Team team, Position position) {
    this.name = name;
    this.surname = surname;
    this.sex = sex;
    this.team = team;
    this.position = position;
  }

  public Player(String name, String surname, byte age, Sex sex, Team team, Position position) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.sex = sex;
    this.team = team;
    this.position = position;
  }

  /**
   * Increase points if player is active and cards < 2
   * 
   * @param points the number of points to increase
   * @return true if the points are increased
   */
  public boolean increasePoints(int points) {
    if (active && points > 0 && cards < 2) {
      this.points += points;

      return true;
    }

    return false;
  }

  /**
   * Decrease points of player, only if the player is active, cards < 2 and points
   * are > 0
   * 
   * @param points the number of points to decrease
   * @return true if the points are decreased
   */
  public boolean decreasePoints(int points) {
    if (active && points > 0 && cards < 2) {
      this.points -= points;

      return true;
    }

    return false;
  }

  /**
   * Add 1 to number of cards if player is active and cards < 2
   * 
   * @return true if player get a new card
   */
  public boolean giveCard() {
    if (active && cards < 2) {
      cards++;

      if (cards >= 2) {
        active = !active;
      }

      return true;
    }

    return false;
  }

  @Override
  public String toString() {
    return "Player [name=" + name + ", surname=" + surname + ", height=" + height + ", weight=" + weight + ", age="
        + age + ", sex=" + sex + ", points=" + points + ", team=" + team + ", position=" + position + ", active="
        + active + ", cards=" + cards + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public byte getAge() {
    return age;
  }

  public void setAge(byte age) {
    this.age = age;
  }

  public Sex getSex() {
    return sex;
  }

  public void setSex(Sex sex) {
    this.sex = sex;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public byte getCards() {
    return cards;
  }

  public void setCards(byte cards) {
    this.cards = cards;
  }

  
}
