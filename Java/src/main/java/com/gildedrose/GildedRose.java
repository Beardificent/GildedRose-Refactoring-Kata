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
        //remove excess if statements (those that are highlighted/always true - always false)
        switch (item.name) {
            case "Aged Brie":
                if (item.quality < 50) { //if quality less than 50
                    item.quality += 1; // quality +1

                }
                item.sellIn -= 1; // sellIn -1

                if (item.sellIn < 0) { //if item sell is less than 0
                    if (item.quality < 50) { //if quality less than 50
                        item.quality += 1; // quality +1
                    }
                }
                break;
            case "Backstage passes to a TAFKAL80ETC concert":

                //Copy conditional to clipboard.
                //Select entire else body:: EXTRACT METHOD to whatevername::
                //SURROUND with IF/ELSE
                //COPY method to both conditions.
                //INLINE IT.
                //remove excess if statements
                if (item.quality < 50) { //if quality less than 50
                    item.quality += 1; //quality +1
                    if (item.sellIn < 11) { //if item sellIn less than 11
                        if (item.quality < 50) { // if quality also less than 50
                            item.quality += 1; //quality +1
                        }
                    }
                    if (item.sellIn < 6) { //if item sellIn less than 6
                        if (item.quality < 50) { // if quality also less than 50
                            item.quality += 1; // quality +1
                        }
                    }
                }
                item.sellIn -= 1; //sellIn -1

                if (item.sellIn < 0) { //if quality less than 0
                    item.quality = 0; // quality = 0
                }
                break;
            case "Sulfuras, Hand of Ragnaros":
                //Copy conditional to clipboard.
                //Select entire else body:: EXTRACT METHOD to whatevername (will be deleted after inline step)
                //SURROUND with IF/ELSE
                //COPY method to both conditions.
                //INLINE IT.
                //remove excess if statements
                break;
            case "conjured":
                //logic for conjured items
            default:
                if (item.quality > 0) { // if quality greater than 0
                    item.quality -= 1; // quality -1
                }
                item.sellIn -= 1; // sellIn -1

                if (item.sellIn < 0) { // if sellIn is less than 0
                    if (item.quality > 0) { // if also quality is greater than 0
                        item.quality -= 1; // quality -1
                    }
                }
                break;
        }
    }
}