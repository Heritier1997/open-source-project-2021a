package com.HeritierOtiom;

public interface OrderOperations {
    int getNumberOfItems();
    void addItem(MenuItem item);
    MenuItem getItem(int itemIndex);
}
