package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        //loops through the entire items list to match against certain conditions.switched to a for each.
        //look into switch case to replace all these nested if statements, possible doubles.
        for (Item item : items) {
            //if the item name matches Aged Brie AND there's no item with the name backstage...

            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                //THEN IF IQ is greater than 0
                if (item.quality > 0) {
                    // Then if there is no item that matches the following
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality = item.quality - 1;
                    }
                }
            } else {
                // if IQ is less than 50
                if (item.quality < 50) {
                    // IQ + 1?
                    item.quality = item.quality + 1;
                    //if the item name equals following string
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        //if expirationday is less than 11
                        if (item.sellIn < 11) {
                            // if IQ is less than 59
                            if (item.quality < 50) {
                                // IQ + 1
                                item.quality = item.quality + 1;
                            }
                        }
                        // if expirationday is less than 6
                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality = item.quality + 1;
                            }
                        }
                    }
                }
            }
        //sulfuras is legendary and doesnt spoil so if it isnt sulfuras IQ -1
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.quality = item.quality - 1;
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
            }
        }
    }
}