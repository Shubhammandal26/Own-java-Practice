 
   package com.kodewala.revision;
   
   class ShippingCostManagement
   {
    public static void main(String[] args)
   {
    ShippingService service = new ShippingService();
	
	StandardShipping standard = new StandardShipping();
	service.processShipping(standard);
	
	ExpressShipping express = new ExpressShipping();
	service.processShipping(express);
	
	InternationalShipping international = new InternationalShipping();
	service.processShipping(international);
   
   }
   }
    