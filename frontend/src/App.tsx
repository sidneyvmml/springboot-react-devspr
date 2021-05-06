import Footer from "componentes/Footer"
import Navbar from "componentes/NavBar"
import DataTable from "componentes/DataTable"
import BarChart from "componentes/BarChart"
import DonutChart from "componentes/DonutChart"

function App() {
  return (
    <>
      <div className="container">
        <Navbar />
        <h1 className="text-primary">Dashboard de Vendas</h1>
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de Sucesso</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5>Todas as Vendas</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas as Vendas</h2>
        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  )
}

export default App
