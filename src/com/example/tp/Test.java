package com.example.tp;

public class Test {
	public static void main(String[] args) {
        NotificationManager mgr = new NotificationManager();

        mgr.addChannel(new EmailNotification("no-reply@monapp.com"));
        mgr.addChannel(new SMSNotification("+33123456789"));
        mgr.addChannel(new PushNotification("com.monapp.id"));

        mgr.broadcast("asmalaouy53.com", "Votre commande est expédiée.");
        mgr.broadcast("+0712415668", "Votre code de vérification est 123456.");
    }
}
