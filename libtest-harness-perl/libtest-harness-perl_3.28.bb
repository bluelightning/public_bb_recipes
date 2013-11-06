SUMMARY = "Test::Harness - Run Perl standard test scripts with statistics"
AUTHOR = "Curis \"Ovid\" Poe <ovid@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Test::Harness"
SECTION = "libs"
LICENSE = "GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=37947a7c4fbd4a63c41d1bfa385e0c1e"

RPROVIDES_${PN} = "libapp-prove-perl \
                  libapp-prove-state-perl \
                  libapp-prove-state-result-perl \
                  libapp-prove-state-result-test-perl \
                  libtap-base-perl \
                  libtap-formatter-base-perl \
                  libtap-formatter-color-perl \
                  libtap-formatter-console-perl \
                  libtap-formatter-console-parallelsession-perl \                  
                  libtap-formatter-console-session-perl \
                  libtap-formatter-file-perl \
                  libtap-formatter-file-session-perl \
                  libtap-formatter-session-perl \
                  libtap-harness-perl \
                  libtap-object-perl \
                  libtap-parser-perl \
                  libtap-parser-aggregator-perl \
                  libtap-parser-grammar-perl \
                  libtap-parser-iterator-perl \
                  libtap-parser-iterator-array-perl \
                  libtap-parser-iterator-process-perl \
                  libtap-parser-iterator-stream-perl \
                  libtap-parser-iteratorfactory-perl \
                  libtap-parser-multiplexer-perl \
                  libtap-parser-result-perl \
                  libtap-parsser-result-bailout-perl \
                  libtap-parser-result-comment-perl \
                  libtap-parser-result-plan-perl \
                  libtap-parser-result-pragma-perl \
                  libtap-parser-result-test-perl \
                  libtap-parser-result-unknown-perl \
                  libtap-parser-result-version-perl \
                  libtap-parser-result-yaml-perl \
                  libtap-parser-resultfactory-perl \
                  libtap-parser-scheduler-perl \
                  libtap-parser-scheduler-job-perl \
                  libtap-parser-scheduler-spinner-perl \
                  libtap-parser-source-perl \
                  libtap-parser-sourcehandler-perl \
                  libtap-parser-sourcehandler-executable-perl \
                  libtap-parser-sourcehandler-file-perl \
                  libtap-parser-sourcehandler-handle-perl \
                  libtap-parser-sourcehandler-perl-perl \
                  libtap-parser-sourcehandler-rawtap-perl \
                  libtap-parser-utils-perl \
                  libtap-parser-yamlish-reader-perl \
                  libtap-parser-yamlish-writer-perl \
                  "
                  
SRC_URI = "http://cpan.metacpan.org/authors/id/O/OV/OVID/Test-Harness-${PV}.tar.gz"
SRC_URI[md5sum] = "e71faf73830f249e2eb569a52362c106"
SRC_URI[sha256sum] = "209d538a7809935967c2c148a36c75a2959a3c3432e1d406288662632870a07c"

S = "${WORKDIR}/Test-Harness-${PV}/"

inherit cpan

BBCLASSEXTEND = "native"


