// This class was generated on Mon, 03 Jul 2017 13:56:47 PDT by version 0.01 of Braintree SDK Generator
// Transaction.java
// DO NOT EDIT
// @type object
// @json {"Type":"Transaction","VariableName":"","Description":"An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":[{"Type":"Amount","VariableName":"amount","Description":"The payment amount, with break-ups.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null},{"Type":"string","VariableName":"custom","Description":"A free-form field for clients' use.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"description","Description":"The description of what is being paid for.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"invoice_number","Description":"The invoice number to track this payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Item List","VariableName":"item_list","Description":"The list of items being paid for.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"note_to_payee","Description":"An optional note to the recipient of the funds in this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"notify_url","Description":"The URL to send payment notifications.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"order_url","Description":"The URL on the merchant site related to this payment.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payee","VariableName":"payee","Description":"The payee who receives the funds and fulfills the order.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Payment Options","VariableName":"payment_options","Description":"The payment options requested for this transaction.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"purchase_order","Description":"purchase order is number or id specific to this payment","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"reference_id","Description":"Optional. The merchant-provided ID for the purchase unit.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"Related Resources","VariableName":"related_resources","Description":"An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.","IsArray":true,"ReadOnly":false,"Required":false,"Properties":null},{"Type":"string","VariableName":"soft_descriptor","Description":"The soft descriptor that is used when charging this funding source. If the string's length is greater than the maximum allowed length, the string is truncated.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null}]}

package com.paypal.sdk.payments.object;

import java.util.Map;
import java.util.List;
import com.google.gson.annotations.SerializedName;
/**
 * An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.
 */
public class Transaction {

	/**
	* REQUIRED
	* The payment amount, with break-ups.
	*/
	@SerializedName("amount")
	private Amount amount;

	public Amount amount() { return amount; }
	
	public Transaction amount(Amount amount) {
	    this.amount = amount;
	    return this;
	}

	/**
	* A free-form field for clients' use.
	*/
	@SerializedName("custom")
	private String custom;

	public String custom() { return custom; }
	
	public Transaction custom(String custom) {
	    this.custom = custom;
	    return this;
	}

	/**
	* The description of what is being paid for.
	*/
	@SerializedName("description")
	private String description;

	public String description() { return description; }
	
	public Transaction description(String description) {
	    this.description = description;
	    return this;
	}

	/**
	* The invoice number to track this payment.
	*/
	@SerializedName("invoice_number")
	private String invoiceNumber;

	public String invoiceNumber() { return invoiceNumber; }
	
	public Transaction invoiceNumber(String invoiceNumber) {
	    this.invoiceNumber = invoiceNumber;
	    return this;
	}

	/**
	* The list of items being paid for.
	*/
	@SerializedName("item_list")
	private ItemList itemList;

	public ItemList itemList() { return itemList; }
	
	public Transaction itemList(ItemList itemList) {
	    this.itemList = itemList;
	    return this;
	}

	/**
	* An optional note to the recipient of the funds in this transaction.
	*/
	@SerializedName("note_to_payee")
	private String noteToPayee;

	public String noteToPayee() { return noteToPayee; }
	
	public Transaction noteToPayee(String noteToPayee) {
	    this.noteToPayee = noteToPayee;
	    return this;
	}

	/**
	* The URL to send payment notifications.
	*/
	@SerializedName("notify_url")
	private String notifyUrl;

	public String notifyUrl() { return notifyUrl; }
	
	public Transaction notifyUrl(String notifyUrl) {
	    this.notifyUrl = notifyUrl;
	    return this;
	}

	/**
	* The URL on the merchant site related to this payment.
	*/
	@SerializedName("order_url")
	private String orderUrl;

	public String orderUrl() { return orderUrl; }
	
	public Transaction orderUrl(String orderUrl) {
	    this.orderUrl = orderUrl;
	    return this;
	}

	/**
	* The payee who receives the funds and fulfills the order.
	*/
	@SerializedName("payee")
	private Payee payee;

	public Payee payee() { return payee; }
	
	public Transaction payee(Payee payee) {
	    this.payee = payee;
	    return this;
	}

	/**
	* The payment options requested for this transaction.
	*/
	@SerializedName("payment_options")
	private PaymentOptions paymentOptions;

	public PaymentOptions paymentOptions() { return paymentOptions; }
	
	public Transaction paymentOptions(PaymentOptions paymentOptions) {
	    this.paymentOptions = paymentOptions;
	    return this;
	}

	/**
	* purchase order is number or id specific to this payment
	*/
	@SerializedName("purchase_order")
	private String purchaseOrder;

	public String purchaseOrder() { return purchaseOrder; }
	
	public Transaction purchaseOrder(String purchaseOrder) {
	    this.purchaseOrder = purchaseOrder;
	    return this;
	}

	/**
	* Optional. The merchant-provided ID for the purchase unit.
	*/
	@SerializedName("reference_id")
	private String referenceId;

	public String referenceId() { return referenceId; }
	
	public Transaction referenceId(String referenceId) {
	    this.referenceId = referenceId;
	    return this;
	}

	/**
	* An array of payment-related transactions. A transaction defines what the payment is for and who fulfills the payment.
	*/
	@SerializedName("related_resources")
	private List<RelatedResources> relatedResources;

	public List<RelatedResources> relatedResources() { return relatedResources; }
	
	public Transaction relatedResources(List<RelatedResources> relatedResources) {
	    this.relatedResources = relatedResources;
	    return this;
	}

	/**
	* The soft descriptor that is used when charging this funding source. If the string's length is greater than the maximum allowed length, the string is truncated.
	*/
	@SerializedName("soft_descriptor")
	private String softDescriptor;

	public String softDescriptor() { return softDescriptor; }
	
	public Transaction softDescriptor(String softDescriptor) {
	    this.softDescriptor = softDescriptor;
	    return this;
	}
}
