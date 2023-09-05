using System;
using Warriors.Enum;

namespace Warriors.Classes
{
    internal class Weapon
    {
        private int damage;
        private Faction faction;

        public Weapon(Faction faction)
        {
            this.faction = faction;
            if ((int) faction == 0) damage = 20;
            else damage = 25;
        }

        public int GetDamage() { return damage; }
        public void SetDamage() 
        {
            Random rd = new Random();
            damage = rd.Next(10, 30);
        }
    }
}
