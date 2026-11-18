package com.koewala.exception2;

public class Service {

	public static void main(String[] args)
	{
		RefundService service = new RefundService();
		int refunds = service.processRefund();
        System.out.println("Refunds Processing: " + refunds);
	}
}

class RefundService
{
	public int processRefund() {

        int refund = 7000;

        try {
            refund = refund - 1000;  // 6000
            int result = 10 / 0;
            return refund;

        } catch (ArithmeticException e) {
            refund = refund + 2000;  // 8000
            return refund;

        } finally {
            refund = refund + 3000; // 11000
            return refund;
        }
    }
}
