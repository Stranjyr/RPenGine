package com.stranjyr.games.engine.rpg.creatures;

import com.stranjyer.games.engine.rpg.items.Item;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by William on 8/8/2014.
 */
public abstract class Creature
{
    protected int x, y, hp;
    protected int[] move;
    protected char icon;
    protected ArrayList<Item> inventory;


    protected Creature(int x, int y, int hp, char icon)
    {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.icon = icon;
    }

    protected Creature(int x, int y, int hp, char icon, Item[] inventory)
    {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.icon = icon;
        this.inventory = new ArrayList<>(Arrays.asList(inventory));

    }
}
