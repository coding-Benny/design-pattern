public class FileNewCmd implements Command {
    private FileNew file;

    public FileNewCmd(FileNew file) {
        this.file = file;
    }

    @Override
    public void execute() {
        file.open();
    }
}
