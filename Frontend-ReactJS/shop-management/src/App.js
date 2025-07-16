import './App.css';
import Navbar from './components/Navbar';

function App() {
  return (
    <>
      <Navbar />

      <div className="pt-16">
        <div className="bg-orange-100 p-6 font-sans min-h-screen">
          <h1 className="text-4xl font-extrabold mb-10 text-center text-[#EF5923] tracking-wide drop-shadow">
            Bienvenue sur votre Espace Vendeur
          </h1>

              <div className="h-12">
      <button
       className="rounded bg-[#EF5923] text-white px-6 py-2 font-semibold">Créer une boutique</button>
    </div>

          <div className="grid gap-8 md:grid-cols-2 lg:grid-cols-3">
            {[...Array(6)].map((_, index) => (
              <div
                key={index}
                className="bg-white rounded-2xl shadow-lg p-6 hover:shadow-2xl transition-all duration-300"
              >
                <div className="flex items-center space-x-4">
                  <div>
                    <h2 className="text-xl font-semibold text-gray-800">Boutique La Paix</h2>
                    <p className="text-sm text-gray-500">Créée le 12 Janvier 2024</p>
                  </div>
                </div>

                <p className="mt-4 text-gray-600">
                  Nous vendons des téléphones, accessoires et forfaits mobiles.
                </p>

                <div className="mt-4 flex flex-wrap gap-4 text-sm text-gray-700">
                  <div className="flex items-center space-x-2">
                    <span className="font-medium">Statut:</span>
                    <span className="px-2 py-1 rounded-full bg-green-100 text-green-600">
                      Active
                    </span>
                  </div>
                  <div className="flex items-center space-x-2">
                    <span className="font-medium">Produits:</span>
                    <span>58</span>
                  </div>
                  <div className="flex items-center space-x-2">
                    <span className="font-medium">Agents:</span>
                    <span>4</span>
                  </div>
                </div>

                <div className="mt-6 flex justify-end space-x-2">
                  <button className="px-4 py-2 bg-[#EF5923] text-white font-medium rounded-lg hover:bg-[#d94c1b] transition">
                    Voir
                  </button>
                  <button className="px-4 py-2 border border-[#EF5923] text-[#EF5923] font-medium rounded-lg hover:bg-[#fef1ed] transition">
                    Modifier
                  </button>
                </div>
              </div>
            ))}
          </div>
        </div>
      </div>
    </>
  );
}

export default App;
