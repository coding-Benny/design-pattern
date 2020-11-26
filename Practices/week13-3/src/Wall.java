public class Wall extends MapSite {
    @Override
    public void enter(Maze maze) {
        MazeController controller = MazeController.getInstance();   // 컨트롤러 인스턴스를 가져와서
        controller.process("벽으로 막혀있어요~~~"); // 창에 안내 메세지 출력
    }
}
