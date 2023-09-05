using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Warriors.Enum;

namespace Warriors.Classes
{
    internal class Armor
    {
        private int armorPoints;
        private Faction faction;

        public Armor(Faction faction)
        {
            this.faction = faction;
            if (faction == 0) armorPoints = 100;
            else armorPoints = 50;
        }

        public int GetArmorPoints() { return armorPoints; }
    }
}
