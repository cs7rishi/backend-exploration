import notificationSystem.Notification;
import pattern.User;

public class Main {

  public static void main(String[] args) {
    //Pattern
    User user = new User.UserBuilder("John Doe", "9876543210")
        .setEmail("john@example.com")
        .setAddress("Bangalore")
        .build();

    System.out.println(user);

    //Example
    //Notification System
    //Check how the builder method workds
    Notification notif = Notification.builder("Order Shipped", "Your order #1234 has been shipped", "user_456")
        .setImageUrl("https://cdn.site/img1.png")
        .setPriority("HIGH")
        .setChannel("EMAIL")
        .build();

    System.out.println(notif.toString());
  }
}