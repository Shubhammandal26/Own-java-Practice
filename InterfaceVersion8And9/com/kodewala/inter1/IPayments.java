

    package com.kodewala.inter1;
	
	interface IPayments {

    default void validatePayment() {
        logPayment();
        System.out.println("Validating payment...");
    }

    private void logPayment() {
        System.out.println("Payment validation started");
    }

    static void checkGateway() {
        System.out.println("Checking gateway...");
    }
}

class UPIPaymentss implements IPayments {

    @Override
    public void validatePayment() {
        System.out.println("UPI payment validation");
    }
}

class PaymentServices {

    public static void main(String[] args) {

        IPayments payment = new UPIPaymentss();

        payment.validatePayment();

        IPayments.checkGateway();
    }
}