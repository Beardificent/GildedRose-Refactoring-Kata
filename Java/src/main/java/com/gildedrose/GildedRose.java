package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    //used extract method to get the entire if conditional body::
    //makes it cleaner to read the updateQuality method.
    public void updateQuality() {
        for (Item item : items) {
            checkConditionsUpdateQuality(item);
        }
    }



    private void checkConditionsUpdateQuality(Item item) {
        //Copy conditional to clipboard.
        //Select entire else body:: EXTRACT METHOD to whatevername (foo eg)::
        //SURROUND with IF/ELSE
        //COPY method to both conditions.
        //INLINE IT.
        switch (item.name) {
            case "Aged Brie":
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                }
                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":

                //Copy conditional to clipboard.
                //Select entire else body:: EXTRACT METHOD to whatevername::
                //SURROUND with IF/ELSE
                //COPY method to both conditions.
                //INLINE IT.
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                    if (item.sellIn < 11) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                    if (item.sellIn < 6) {
                        if (item.quality < 50) {
                            item.quality = item.quality + 1;
                        }
                    }
                }
                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    item.quality = 0;
                }
                break;
            case "Sulfuras, Hand of Ragnaros":
                //Copy conditional to clipboard.
                //Select entire else body:: EXTRACT METHOD to whatevername::
                //SURROUND with IF/ELSE
                //COPY method to both conditions.
                //INLINE IT.

                break;
            default:
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }
                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    if (item.quality > 0) {
                        item.quality = item.quality - 1;
                    }
                }
                break;
        }
            }
        }