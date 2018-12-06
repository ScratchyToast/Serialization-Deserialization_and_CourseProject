using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;
using System.Runtime.Serialization.Json;
using System.Runtime.Serialization;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    [DataContract]
    public class Laptop
    {
        [DataMember]
        public string Company { get; set; }
        [DataMember]
        public string Model { get; set; }
        [DataMember]
        public string CPU { get; set; }
        [DataMember]
        public string RAM { get; set; }
        [DataMember]
        public string SSD_capacity { get; set; }

        public Laptop(string company, string model, string cpu, string ram, string ssd)
        {
            Company = company;
            Model = model;
            CPU = cpu;
            RAM = ram;
            SSD_capacity = ssd;
        }

    }


    class Program
    {
        static void Main(string[] args)
        {
            Laptop laptop_1 = new Laptop("ASUS", "FX553VE", "Intel Core i5 7300hq", "8 gb", "256 gb");
            Laptop[] laptops = new Laptop[] { laptop_1 };

            DataContractJsonSerializer jsonForm = new DataContractJsonSerializer(typeof(Laptop[]));

            // Serialization 
            using (FileStream fs = new FileStream("laptops.json", FileMode.OpenOrCreate))
            {
                jsonForm.WriteObject(fs, laptops);
            }

            // Deserialization 

            /*
            using (FileStream fs = new FileStream("laptops.json", FileMode.OpenOrCreate))
            {
                Laptop[] newlap = (Laptop[])jsonForm.ReadObject(fs);

                foreach (Laptop l in newlap)
                {
                    Console.WriteLine(" Компания: {0} \n --- \n Модель: {1} \n --- \n Процессор: {2} \n --- \n ОЗУ: {3} \n --- \n SSD {4}", l.Company, l.Model, l.CPU, l.RAM, l.SSD_capacity);
                
                }
                Console.ReadKey();
            }
            */

        }
    }
}
