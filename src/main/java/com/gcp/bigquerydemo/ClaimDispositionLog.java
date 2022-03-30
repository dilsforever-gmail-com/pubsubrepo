package com.gcp.bigquerydemo;

import lombok.Data;

import java.util.List;

@Data
public class ClaimDispositionLog {

    private int divisionId;

    private String reservationNumber;

    private String orderNumber;

    private String createdDate;

    private int shipmentNumber;

    private String claimId;

    private String requestedAction;

    private String creditTo;

    private String reshipTo;

    private Double refundAmount;

    private List<LineItem> lineItems;

    private String fillLocation;

    private String fulfillmentStatus;

    private boolean isBOPS;

    private boolean isBOSS;

    private String trackingCompany;

    private boolean isStandardFillLocation;

    private boolean hasPOD;

    private boolean isDisputedPOD;

    private boolean correctAddress;

    private String registryBarcode;

    private boolean isInternationalOrder;

    private String trackingNumber;

    private String expectedDeliveryDate;

    private String actualDeliveryDate;

    private String lastTrackingEventStatus;

    private int daysSinceShipped;

    private int daysSinceDelivered;

    private boolean isSDD;

    private boolean isRegistry;

    private String decision;

    private String decisionReason;

    private String[] warning;

    private String followedAction;

    private List<Note> Notes;

    private int inrAccountCount;

    private int accountCount;

    private int inrOrderCount;

    private int totalOrderCount;

    private double inrRefundedSum;

    private double totalOrderSum;

    private double inrRateCount;

    private double inrRateSum;

    private int daysFromOrderToClaim;
}
