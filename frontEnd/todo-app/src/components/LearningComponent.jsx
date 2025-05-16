import Header from "./Header";
import ComponentOne from "./ComponentOne";
import ClassComponent from "./ClassComponent";
import Footer from "./Footer";

export default function LearningComponent() {
    return (
        <div>
            <Header></Header>
            <p>3 components - Header, component one, footer</p>
            <ComponentOne></ComponentOne>
            <ClassComponent></ClassComponent>
            <Footer></Footer>
        </div>
    );
}