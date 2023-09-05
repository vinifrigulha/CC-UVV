using System;
using Warriors.Enum;

namespace Warriors.Classes
{
    internal class Warrior
    {
        private Faction faction;
        private int health;
        private string name;
        private bool isAlive;
        private Weapon weapon;
        private Armor armor;

        public Warrior(string name, Faction faction)
        {
            this.name = name;
            this.faction = faction;
            isAlive = true;
            weapon = new Weapon(faction);
            armor = new Armor(faction);
            health = 100 + armor.GetArmorPoints();
        }

        public bool GetIsAlive() { return isAlive; }

        public void Attack(Warrior enemy)
        {
            Console.WriteLine("\n\n***********************************");
            Console.WriteLine($"{name} attacked {enemy.name} for {weapon.GetDamage()} points");

            enemy.health -= weapon.GetDamage();
            health -= enemy.weapon.GetDamage();

            if (health <= 0) health = 0;
            if (enemy.health <= 0) enemy.health = 0;

            Console.WriteLine($"{name} current health: {health}");
            Console.WriteLine($"{enemy.name} current health: {enemy.health}");
            Console.WriteLine("***********************************");

            if (health == 0)
            {
                Console.WriteLine($"\n{enemy.name} wins!!");
                isAlive = false;

                return;
            }
            else if (enemy.health == 0)
            {
                Console.WriteLine($"\n{name} wins!");
                enemy.isAlive = false;

                return;
            }

            weapon.SetDamage();
            enemy.weapon.SetDamage();
        }
    }
}
