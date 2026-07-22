import React,{Component} from "react";
import Post from "./Post";

class Posts extends Component{
    constructor(props){
        super(props);

        this.state = {
            posts:[]
        };
    }

    loadPosts = () => {
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(response => response.json())
        .then(data => {
            const posts = data.map(
                items => new Post(items.id,items.title,items.body)
            );

            this.setState({
                posts:posts
            });
        })
        .catch(error => {
            throw error;
        });
    };

    componentDidMount(){
        this.loadPosts();
    }

    componentDidCatch(error,info){
        alert("Error: "+error.message);
        console.log(error,info);
    }

    render(){
        return(
            <div style={{margin: "20px"}}>
                <h1>Posts</h1>
                {this.state.posts.map(post => (
                    <div key = {post.id} style={{border: "1px solid black",padding: "10px",marginBottom:"15px"}}>
                        <h3>{post.title}</h3>
                        <h3>{post.body}</h3>
                    </div>
                ))}
            </div>
        );
    }
}


export default Posts;