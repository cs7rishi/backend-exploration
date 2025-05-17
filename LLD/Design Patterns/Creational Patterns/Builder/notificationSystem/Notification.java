package notificationSystem;

public class Notification {

  private final String title;
  private final String body;
  private final String targetUserId;
  private final String imageUrl;
  private final String actionUrl;
  private final String priority;
  private final String channel;

  private Notification(NotificationBuilder builder) {
    this.title = builder.title;
    this.body = builder.body;
    this.targetUserId = builder.targetUserId;
    this.imageUrl = builder.imageUrl;
    this.actionUrl = builder.actionUrl;
    this.priority = builder.priority;
    this.channel = builder.channel;
  }

  public static NotificationBuilder builder(String title, String body, String targetUserId) {
    return new NotificationBuilder(title,body,targetUserId);
  }

  @Override
  public String toString() {
    return "Notification{" +
        "title='" + title + '\'' +
        ", body='" + body + '\'' +
        ", targetUserId='" + targetUserId + '\'' +
        ", imageUrl='" + imageUrl + '\'' +
        ", actionUrl='" + actionUrl + '\'' +
        ", priority='" + priority + '\'' +
        ", channel='" + channel + '\'' +
        '}';
  }

  public static class NotificationBuilder {

    private final String title;
    private final String body;
    private final String targetUserId;

    private String imageUrl;
    private String actionUrl;
    private String priority;
    private String channel;

    public NotificationBuilder(String title, String body, String targetUserId) {
      this.title = title;
      this.body = body;
      this.targetUserId = targetUserId;
    }

    public NotificationBuilder setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    public NotificationBuilder setActionUrl(String actionUrl) {
      this.actionUrl = actionUrl;
      return this;
    }

    public NotificationBuilder setPriority(String priority) {
      this.priority = priority;
      return this;
    }

    public NotificationBuilder setChannel(String channel) {
      this.channel = channel;
      return this;
    }

    public Notification build() {
      return new Notification(this);
    }
  }
}
