package com.java.task2;

public class Bank {

    private byte nominal;
    private short bill;
    private int cashMoney;
    private long coins;

    private float bid;
    private double Ki;

    private char tm;
    private boolean cash;

    private String name;

    private Byte wrapNominal;
    private Short wrapBill;
    private Integer wrapCashMoney;
    private Long wrapCoins;
    private Float wrapBid;
    private Double wrapKi;
    private Character wrapTm;
    private Boolean wrapCash;

    public byte getNominal() {
        return nominal;
    }

    public void setNominal(byte nominal) {
        this.nominal = nominal;
    }

    public short getBill() {
        return bill;
    }

    public void setBill(short bill) {
        this.bill = bill;
    }

    public int getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(int cashMoney) {
        this.cashMoney = cashMoney;
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public float getBid() {
        return bid;
    }

    public void setBid(float bid) {
        this.bid = bid;
    }

    public double getKi() {
        return Ki;
    }

    public void setKi(double ki) {
        Ki = ki;
    }

    public char getTm() {
        return tm;
    }

    public void setTm(char tm) {
        this.tm = tm;
    }

    public boolean isCash() {
        return cash;
    }
    // для логических свойств мы разрешаем методу получения соответствовать шаблону:
    //
    //public boolean is<PropertyName>(); это касается примитивов, для оболочки get

    // Этот формат является стандартным, он определен в спецификации JavaBeans. См. раздел 8.3.2

    public void setCash(boolean cash) {
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getWrapNominal() {
        return wrapNominal;
    }

    public void setWrapNominal(Byte wrapNominal) {
        this.wrapNominal = wrapNominal;
    }

    public Short getWrapBill() {
        return wrapBill;
    }

    public void setWrapBill(Short wrapBill) {
        this.wrapBill = wrapBill;
    }

    public Integer getWrapCashMoney() {
        return wrapCashMoney;
    }

    public void setWrapCashMoney(Integer wrapCashMoney) {
        this.wrapCashMoney = wrapCashMoney;
    }

    public Long getWrapCoins() {
        return wrapCoins;
    }

    public void setWrapCoins(Long wrapCoins) {
        this.wrapCoins = wrapCoins;
    }

    public Float getWrapBid() {
        return wrapBid;
    }

    public void setWrapBid(Float wrapBid) {
        this.wrapBid = wrapBid;
    }

    public Double getWrapKi() {
        return wrapKi;
    }

    public void setWrapKi(Double wrapKi) {
        this.wrapKi = wrapKi;
    }

    public Character getWrapTm() {
        return wrapTm;
    }

    public void setWrapTm(Character wrapTm) {
        this.wrapTm = wrapTm;
    }

    public Boolean getWrapCash() {
        return wrapCash;
    }

    public void setWrapCash(Boolean wrapCash) {
        this.wrapCash = wrapCash;
    }
}
