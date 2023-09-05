using System;
using Warriors.Classes;
using Warriors.Enum;

namespace Warriors
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Olá, bravo guerreiro. \nDigite o seu nome para começarmos: ");
            string name = Console.ReadLine();

            Console.Write("\nAgora escolha a sua facção:\n[0] Gente fina \n[1] Babaca \nDigite sua resposta aqui: ");
            int faction = int.Parse(Console.ReadLine());

            Warrior warrior = new Warrior(name, (Faction)faction);

            Console.Write("\nEscolha o nome do seu inimigo: ");
            string enemyName = Console.ReadLine();
            int enemyFaction;
            if (faction == 0) enemyFaction = 1;
            else enemyFaction = 0;

            Warrior enemy = new Warrior(enemyName, (Faction)enemyFaction);

            do
            {
                warrior.Attack(enemy);
                if (warrior.GetIsAlive() == false) break;
                enemy.Attack(warrior);
                if (enemy.GetIsAlive() == false) break;
            } while (warrior.GetIsAlive() && enemy.GetIsAlive());
        }
    }
}
