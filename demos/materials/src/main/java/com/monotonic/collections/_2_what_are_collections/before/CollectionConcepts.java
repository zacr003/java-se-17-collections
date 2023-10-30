package com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts
{
    public static void main(String[] args)
    {
        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass Window", 10);

       Collection<Product> products = new ArrayList<>();
       products.add(door);
       products.add(floorPanel);
       products.add(window);
        System.out.println(products);

        // For each loop to iterate through all available products
        products.removeIf(product -> product.weight() > 20);
    }
}
